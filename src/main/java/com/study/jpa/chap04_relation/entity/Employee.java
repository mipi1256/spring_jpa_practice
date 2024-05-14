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
@Table(name = "tbl_emp")
public class Employee {

   @Id
   @GeneratedValue(strategy = IDENTITY)
   @Column(name = "emp_id")
   private Long id;

   @Column(name = "emp_name", nullable = false)
   private String name;

   @ManyToOne
   @JoinColumn(name = "dpt_id")
   private Department department;



}












































