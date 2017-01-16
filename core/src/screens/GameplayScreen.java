package screens;

import entities.Player;
import pl.maciek.ClickerGame;

public class GameplayScreen extends AbstractScreen{
	
	private Player player;
	public GameplayScreen(ClickerGame game) {
		super(game);
		init();
	}

	private void init() {
		initPlayer();
		
	}

	private void initPlayer() {
		// TODO Auto-generated method stub
		player = new Player();
		stage.addActor(player);
		
		
	}
	@Override
	public void render(float delta) {
		super.render(delta);
		update();
		
		spriteBatch.begin();
		stage.draw();
		
		spriteBatch.end();
		
		
	}

	private void update() {
		// TODO Auto-generated method stub
		stage.act();
	}

	
}
