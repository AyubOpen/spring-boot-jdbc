package com.mkyong.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> findAll() {

        List<String> result = jdbcTemplate.query(
                "SELECT menu_item_name from pending_menu_item where menu_item_id=6062",
                (rs, rowNum) -> rs.getString("menu_item_name")
        );

        return result;

    }




}
