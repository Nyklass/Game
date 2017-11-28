package addi;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
      //loops and render
	 LinkedList <GameObject> object = new LinkedList<GameObject>();
	 public void tick(){
		  for(int i =0;i <object.size(); i++){
			  GameObject tempObject = object.get(i);
			  tempObject.tick();
		  } 
	 }
	 public void render(Graphics g){
		  for(int i =0;i <object.size(); i++){
			  GameObject tempObject = object.get(i);
			  tempObject.render(g);
		  }
	 }
	 public void clearEnemies(){
		 for(int i =0;i <object.size(); i++){
			  GameObject tempObject = object.get(i);
			  
			  if(tempObject.getid() == ID.Player){
				  object.clear();
				  addObject(new Player((int)tempObject.getX(),(int)tempObject.getvelY(),ID.Player,this));
			  }
		 }  
		 
	 }
	 
	 
	 public void addObject(GameObject object){
	this.object.add(object);
	 }
	 public void removeObject(GameObject object){
		 this.object.remove(object);
		 
	 }
}
