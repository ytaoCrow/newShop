package com.ytaocrow.shop.rowmapper;

import com.ytaocrow.shop.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product()
                .setProductId(resultSet.getInt("product_id"))
                .setProductName(resultSet.getString("product_name"))
                .setCategory(resultSet.getString("category"))
                .setImageUrl(resultSet.getString("image_url"))
                .setPrice(resultSet.getInt("price"))
                .setStock(resultSet.getInt("stock"))
                .setDescription(resultSet.getString("description"))
                .setCreatedDate(resultSet.getTimestamp("created_date"))
                .setLastModifiedDate(resultSet.getTimestamp("last_modified_date"));

        return product;
    }
}
