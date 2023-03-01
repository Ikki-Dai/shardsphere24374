package com.example.shardsphere24374;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * order
 *
 * @author
 */
@Getter
@Setter
public class Order implements Serializable {
    private Integer id;

    private String product;

    private Integer amount;

    private Instant createTime;

    private static final long serialVersionUID = 1L;
}