package screens;

import com.badlogic.gdx.graphics.Texture;

import pl.maciek.ClickerGame;

public class SplashScreen extends AbstractScreen{
	
	private Texture splashImg;
	

	public SplashScreen(ClickerGame game) {
		super(game);
		init();
		
	}


	private void init() {
		
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
