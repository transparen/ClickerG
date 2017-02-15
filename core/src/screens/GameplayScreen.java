package screens;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import entities.Player;
import pl.maciek.ClickerGame;

public class GameplayScreen extends AbstractScreen {

	private Player player;
	private Button playerButton;

	public GameplayScreen(ClickerGame game) {
		super(game);
	}

	protected void init() {
		initPlayer();
		initPlayerButton();
		

	}

	private void initPlayerButton() {
		// TODO Auto-generated method stub
		playerButton = new Button(new ButtonStyle());
		playerButton.setWidth(460);
		playerButton.setHeight(360);
		playerButton.setX(10);
		playerButton.setY(170);
		playerButton.setDebug(true);
		
		stage.addActor(playerButton);
		playerButton.addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				System.out.println("click");
				
				player.reactOnClick();
				game.addPoint();
				
				
				return super.touchDown(event, x, y, pointer, button);
			}
			
		});
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

		System.out.println("poitnts: " + game.getPoints());
		
		spriteBatch.begin();
		stage.draw();

		spriteBatch.end();
		

	}

	private void update() {
		// TODO Auto-generated method stub
		stage.act();
	}

}
