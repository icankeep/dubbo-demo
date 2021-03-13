package passer.domain;

import java.io.Serializable;

/**
 * @author zhouwenhua02
 * @date 2021/3/13
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
