package guru.springframework.SpringJokesApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.springframework.SpringJokesApp.Sevices.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;
//	private JokeService jokeSevice;
	//private JokeService jokeSevice;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	/* @RequestMapping(value="/",method = RequestMethod.GET) */
	@RequestMapping
	public String showJoke( Model model)
	
	{
		String joke = this.jokeService.getJoke();
		System.out.println("output "+joke);
		//model.addAttribute("joke", jokeSevice.getJoke() );
		model.addAttribute("joke",joke);
		return "index";
	}

}
