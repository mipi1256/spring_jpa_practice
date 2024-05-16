package com.study.jpa.chap05_practice.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.IDENTITY;

@Setter @Getter
@ToString(exclude = {"post"})
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_hash_tag")
public class HashTag {

   @Id
   @GeneratedValue(strategy = IDENTITY)
   @Column(name = "tag_no")
   private Long id;

   private String tagName; // 해시태그 이름

   @ManyToOne(fetch = LAZY, cascade = CascadeType.REMOVE) // Almost the default fetch type
   @JoinColumn(name = "post_no")
   private Post post;



}












































