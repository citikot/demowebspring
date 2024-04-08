package online.agatstudio.demoweb.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {

    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 15, message = "Username must be between 3 and 15 symbols")
    private String username;
    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 15, message = "Password must be between 8 and 15 symbols")
    private String password;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
