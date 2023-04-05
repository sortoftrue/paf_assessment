package ibf2022.paf.assessment.server;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ibf2022.paf.assessment.server.models.User;
import ibf2022.paf.assessment.server.repositories.UserRepository;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner{

	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// String user = "arney";
		// Optional<User> result = userRepo.findUserByUsername(user);

		// if(result.isEmpty()){
		// 	System.out.println("not found");
		// } else{
		// 	System.out.println(result.get());
		// }

		//System.out.println(userRepo.insertUser(null));
		


	}
}
