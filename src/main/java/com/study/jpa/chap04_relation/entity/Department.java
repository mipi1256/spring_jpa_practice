package com.study.jpa.chap04_relation.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;

@Setter @Getter @ToString
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_dept")
public class Department {

   @Id
   @GeneratedValue(strategy = IDENTITY)
   @Column(name = "dept_id")
   private Long id;

   @Column(name = "dept_name", nullable = false)
   private String name;

}












































