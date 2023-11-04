package {{ global_computed_inputs.base_package }}

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class {{ global_computed_inputs.application_name }}Application

fun main(args: Array<String>) {
	runApplication<{{ global_computed_inputs.application_name }}Application>(*args)
}
