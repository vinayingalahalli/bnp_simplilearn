package com.app.bo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.bo.PlayerBO;
import com.app.bo.PlayerBOImpl;
import com.app.model.Player;

public class PlayerBOImplTest {
private static PlayerBO bo=new PlayerBOImpl();
//	@BeforeAll
//	public static void setUpBeforeClass() throws Exception {
//		bo=new PlayerBOImpl();
//	}

	@Test
	public void testCreatePlayer() {
		Player p=new Player("fdsf", "dsffds", 77, "f");
		Assertions.assertEquals(100, bo.createPlayer(p).getId());
	}

	@Test
	public void testGetPlayerById() {
		Assertions.assertEquals(new Player(100, "dffd", "fsd", 11, "m"), bo.getPlayerById(100));
	}

}
