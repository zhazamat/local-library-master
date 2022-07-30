package library.avenir.test.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSummaryDto {

    private Long id;
    private String username;
    private String name;

    public UserSummaryDto(Long id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }
}
