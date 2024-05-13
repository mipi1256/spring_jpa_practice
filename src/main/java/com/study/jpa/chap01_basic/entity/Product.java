package com.study.jpa.chap01_basic.entity;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.GenerationType.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
@Entity
@Table(name = "tbl_product")
public class Product {

   @Id
   @GeneratedValue(strategy = IDENTITY)
   @Column(name = "prod_id")
   private Long id;

   @Column(name = "prod_name", nullable = false, length = 30)
   private String name;

   private int price;

   @Enumerated(STRING)
   private Category category;

   @CreationTimestamp
   @Column(updatable = false)
   private LocalDateTime createDate;

   @UpdateTimestamp
   private LocalDateTime updateDate;

   public enum Category {
      FOOD, FASHION, ELECTRONIC
   }





}












































