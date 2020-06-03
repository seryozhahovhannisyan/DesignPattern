package seryozha.hovhannisyan;

import java.io.InputStreamReader;
import java.util.*;

class colored_node {
    ArrayList<colored_node> child;//children of the present node
    int size;
    int color;//color of the current node
    int index;
    boolean visited;//makes sure a node is visited only once
    colored_node parent;
    List<HashSet<Integer>> list = new ArrayList<>();//list stores unique colours of the subtree ,Hashset is for storing only distinct values

    colored_node(int index) {
        child = new ArrayList<>();
        this.index = index;
    }
}

class coloring_tree {

    public static void compute(colored_node m, boolean[] b) //leaf node is visited first and union is done as it goes up
    {
        Stack<colored_node> stack = new Stack<>();
        stack.push(m);

        while (!stack.isEmpty()) // recursion using stack
        {
            colored_node n = stack.pop();

            if (!n.visited) //if the node is not visited ,child is pushed into the stack and traversed //similar to dfs
            {

                b[n.index] = true;
                n.visited = true;
                stack.push(n);
                for (colored_node c : n.child) {
                    if (!b[c.index]) {
                        c.parent = n;
                        stack.push(c);
                    }
                }

            } else //if the node is visited already then union operation is done to add those colours to parent
            {

                HashSet<Integer> max = null;//finds the child with max unique colours in order to reduce the space and time complexity by reusing it again
                int max1 = 0;
                for (HashSet<Integer> s : n.list) {
                    if (max1 < s.size()) {
                        max1 = s.size();
                        max = s;
                    }
                }
                if (max == null) {
                    max = new HashSet<Integer>();
                }
                for (HashSet<Integer> s : n.list) {
                    if (max != s) {
                        max.addAll(s);//union operation
                    }
                }

                max.add(n.color);
                if (n.parent != null) {
                    n.parent.list.add(max);//distinct colours of the present node are sent to the parent
                }
                n.size = max.size();//number of distinct colours of present subtree/node
            }
        }
        b[m.index] = true;
    }


    // https://www.hackerrank.com/challenges/coloring-tree/problem
    public static void main(String argv[])//gets input from user
    {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int N = sc.nextInt();//no of nodes
        int M = sc.nextInt();//no of queries
        int r = sc.nextInt();//root node index
        colored_node[] nodes = new colored_node[N + 1];
        for (int i = 1; i < nodes.length; i++) {
            nodes[i] = new colored_node(i);
        }
        for (int i = 0; i < N - 1; i++)//N-1 edges
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            nodes[n1].child.add(nodes[n2]);//we link both the nodes since the edges are bidirectional
            nodes[n2].child.add(nodes[n1]);
        }
        for (int i = 1; i <= N; i++) {
            nodes[i].color = sc.nextInt();//stores the colour of the node
        }
        compute(nodes[r], new boolean[N + 1]);
        for (int i = 0; i < M; i++) {
            System.out.println(nodes[sc.nextInt()].size);//no of distinct colors for the requested subtree/node
        }
    }
}