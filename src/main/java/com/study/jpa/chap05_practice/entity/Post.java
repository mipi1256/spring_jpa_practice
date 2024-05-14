package com.study.jpa.chap05_practice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.*;

@Setter @Getter
@ToString(exclude = {"hashTags"})
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_post")
public class Post {

   @Id
   @GeneratedValue(strategy = IDENTITY)
   @Column(name = "post_no")
   private Long id; // 글 번호

   @Column(nullable = false)
   private String writer; // 작성자

   private String content; // 작성 내용

   @CreationTimestamp
   @Column(updatable = false)
   private LocalDateTime createDate; // 작성 시간

   @UpdateTimestamp
   private LocalDateTime updateDate; // 수정 시간

   @OneToMany(mappedBy = "post")
   List<HashTag> hashTags = new ArrayList<>();

}












































