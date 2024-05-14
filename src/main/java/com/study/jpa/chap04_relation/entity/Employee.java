package com.study.jpa.chap04_relation.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

@Setter @Getter
// JPA 연관관계 맵핑에서 연관관계 데이터는 toString에서 제외해야 합니다 (순환 참조 발생)
@ToString(exclude = {"department"})
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

   // EAGER: 항상 무조건 조인을 수행
   // LAZY: 필요한 경우에만 조인을 수행 (실무)
   @ManyToOne(fetch = LAZY)
   @JoinColumn(name = "dpt_id")
   private Department department;



}












































