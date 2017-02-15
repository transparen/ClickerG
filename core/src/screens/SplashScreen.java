package screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

import pl.maciek.ClickerGame;

public class SplashScreen extends AbstractScreen{
	
	private Texture splashImg;
	

	public SplashScreen(final ClickerGame game) {
		super(game);
		init();
		
		Timer.schedule(new Task (){
			
					public void run(){
						System.out.println("Po 1 sekundzie");
						game.setScreen(new GameplayScreen(game));
						
					}
		}, 1);
		
	}

	protected void init() {
		// TODO Auto-generated method stub
		//TODO   implements better assets loading when game growss
				splashImg = new Texture("badlogic.jpg");
	}
	


	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		super.render(delta);
		
		spriteBatch.begin();
		
		
		spriteBatch.draw(splashImg, 0, 0);
		
		spriteBatch.end();
		
	}




	
	

	

}
