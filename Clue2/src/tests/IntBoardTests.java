package tests;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import board.IntBoard;

public class IntBoardTests {
	private IntBoard board;
	@Before
	public void setup(){
		board = new IntBoard();
		board.calcAdjacencies();
	}
	@Test
	public void testCalcIndex1() {
		int actual =board.calcIndex(0,0);
		Assert.assertEquals(0, actual);
	}
	@Test
	public void testCalcIndex2() {
		int actual =board.calcIndex(1,1);
		Assert.assertEquals(5, actual);
	}
	@Test
	public void testCalcIndex3() {
		int actual =board.calcIndex(3,3);
		Assert.assertEquals(15, actual);
	}
	
	@Test
	public void testAdjecency1(){
		//test the adjacency list for the left top corner
		LinkedList adjList = board.getAdjList(0);
		Assert.assertTrue(adjList.contains(4));
		Assert.assertTrue(adjList.contains(1));
		Assert.assertEquals(2, adjList.size());
	}
	@Test
	public void testAdjecency2(){
		//test the adjacency list for the bottom right corner
		LinkedList adjList = board.getAdjList(15);
		Assert.assertTrue(adjList.contains(11));
		Assert.assertTrue(adjList.contains(14));
		Assert.assertEquals(2, adjList.size());
	}
	@Test
	public void testAdjecency3(){
		//test the adjacency list for the right edge
		LinkedList adjList = board.getAdjList(7);
		Assert.assertTrue(adjList.contains(3));
		Assert.assertTrue(adjList.contains(11));
		Assert.assertTrue(adjList.contains(6));
		Assert.assertEquals(3, adjList.size());
	}
	
}
