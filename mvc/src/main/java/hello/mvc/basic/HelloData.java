package hello.mvc.basic;

import lombok.Data;

@Data    // 롬복 @Data = @Getter @Setter @ToString @EqualsAndHashCode @RequiredArgsConstructor를 자동으로 적용해줌
public class HelloData {
    private String username;
    private int age;
}
