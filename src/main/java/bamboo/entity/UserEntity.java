package bamboo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    private int userNo;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "nickname", nullable = false)
    private String nickname;
    @Column(name = "id", nullable = false)
    private String id;
    @Column(name = "profile_img", nullable = false)
    private String profileImg;
    @Column(name = "birth", nullable = false)
    private LocalDateTime birth;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "role", nullable = false)
    private int role;
}
