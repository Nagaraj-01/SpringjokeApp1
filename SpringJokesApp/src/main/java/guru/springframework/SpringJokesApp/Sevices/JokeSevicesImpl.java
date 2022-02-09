package guru.springframework.SpringJokesApp.Sevices;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeSevicesImpl  implements JokeService{
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	

	public JokeSevicesImpl() {
		super();
		this.chuckNorrisQuotes=new ChuckNorrisQuotes();
	}


	@Override
	public String getJoke() {
		//System.out.println("hello");

		return chuckNorrisQuotes.getRandomQuote();
	}
	

}
