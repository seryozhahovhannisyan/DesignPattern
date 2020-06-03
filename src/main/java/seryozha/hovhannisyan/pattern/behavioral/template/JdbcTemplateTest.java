package seryozha.hovhannisyan.pattern.behavioral.template;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
    public static void main(String[] args) {
        getTemplate();
//        template.queryForList()
    }

    private static void getTemplate() {
        JdbcTemplate template = new JdbcTemplate();
        template.execute("");
    }


}
