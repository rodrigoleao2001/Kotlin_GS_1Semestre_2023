import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.global_solution.MainActivity
import br.com.fiap.global_solution.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            // Exemplo de uma simples lógica de autenticação
            if (username == "admin" && password == "password") {
                // Se a autenticação for bem-sucedida, navegue para a próxima Activity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Se a autenticação falhar, exiba uma mensagem de erro
                Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_LONG).show()
            }
        }
    }
}
