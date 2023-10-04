package com.modul;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import algo_optimisation.dijkstra.Dijkstra;
import algo_optimisation.dijkstra.Node;
import algo_optimisation.max_flow.FordFulkerson;
import algo_optimisation.max_flow.Vertex;

public class main1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            
         
            //create airports 
            
			server_airport mh5 = new server_airport(11, new position(59.32523459858819,-71.23572694899525),"usa");	
			mh5.setNember_places(2);
			mh5.setNb_voie(1);
			mh5.start();
			server_airport mh6 = new server_airport(23, new position(9.596206264795654,-61.21619569899525),"braz");
			mh6.setNember_places(5);
			mh6.setNb_voie(3);
			mh6.start();
			server_airport mh7 = new server_airport(20, new position(32.613385859779015,7.514273051004752),"tns");
			mh7.setNember_places(10);
			mh7.setNb_voie(2);
			mh7.start();
			server_airport mh8 = new server_airport(21, new position(28.557421153272568,
					43.19786680100475),"a s");
			mh8.setNember_places(3);
			mh8.setNb_voie(6);
			mh8.start();
			server_airport mh9 = new server_airport(30, new position(28.431900191894602,104.89708555100475),"china");
			mh9.setNember_places(8);
			mh9.setNb_voie(7);
			mh9.start();
			server_airport mh10 = new server_airport(24, new position(69.65781652872529,146.20567930100475),"rs");
			mh10.setNember_places(11);
			mh10.setNb_voie(4);
			mh10.start();
			server_airport mh11 = new server_airport(25, new position(80.96127825060933,56.02989805100475),"north rs");
			mh11.setNember_places(6);
			mh11.setNb_voie(2);
			mh11.start();

			
			
			//craete networks airpoet

	        Node nodeA = new Node(mh5);
	        Node nodeB = new Node(mh6);
	        Node nodeC = new Node(mh7);
	        Node nodeD = new Node(mh8);
	        Node nodeE = new Node(mh9);
	        Node nodeF = new Node(mh11);
	        Node nodeG = new Node(mh10);


	        nodeA.addAdjacentNode(nodeB);
	        nodeB.addAdjacentNode(nodeA);
	        nodeA.addAdjacentNode(nodeC);
	        nodeC.addAdjacentNode(nodeA);
	        
	        nodeB.addAdjacentNode(nodeD);
	        nodeD.addAdjacentNode(nodeB);
	        nodeB.addAdjacentNode(nodeE);
	        nodeE.addAdjacentNode(nodeB);
	        
	        nodeC.addAdjacentNode(nodeG);
	        nodeG.addAdjacentNode(nodeC);
	        
	        nodeE.addAdjacentNode(nodeG);
	        nodeG.addAdjacentNode(nodeE);
	        
	        nodeD.addAdjacentNode(nodeF);
	        nodeF.addAdjacentNode(nodeD);
	        
	        nodeG.addAdjacentNode(nodeF);
	        nodeF.addAdjacentNode(nodeG);
	        
	        
	        
	        Vertex<server_airport> A = new Vertex<server_airport>(mh5);
	        Vertex<server_airport> B = new Vertex<server_airport>(mh6);
	        Vertex<server_airport> C = new Vertex<server_airport>(mh7);
	        Vertex<server_airport> D = new Vertex<server_airport>(mh8);
	        Vertex<server_airport> E = new Vertex<server_airport>(mh9);
	        Vertex<server_airport> F = new Vertex<server_airport>(mh11);
	        Vertex<server_airport> G = new Vertex<server_airport>(mh10);
	        
	        A.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),C,C.getData().getNember_places())));
	        B.setNeighbors(new HashMap<>(Map.of(A,A.getData().getNember_places(),D,D.getData().getNember_places(),E,E.getData().getNember_places())));
	        C.setNeighbors(new HashMap<>(Map.of(A,A.getData().getNember_places(),G,G.getData().getNember_places())));
	        D.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),F,F.getData().getNember_places())));
	        E.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),G,G.getData().getNember_places())));
	        G.setNeighbors(new HashMap<>(Map.of(E,E.getData().getNember_places(),C,C.getData().getNember_places(),F,F.getData().getNember_places())));
	        F.setNeighbors(new HashMap<>(Map.of(D,D.getData().getNember_places(),G,G.getData().getNember_places())));
	        
	        System.out.print("The Max Flow  from source "+B.getData().getNameairport()+" to "+A.getData().getNameairport()+" is : ");
	        System.out.println(new FordFulkerson<server_airport>().run(B,A));
	        
	        
	        Dijkstra d1 = new Dijkstra(nodeB);
	        ArrayList<server_airport> a1_ecalier = d1.printPaths(List.of(nodeA)); 
	        
	        
			avion a1 = new avion(1,"boibng "+1+"",1+100,100); 
			a1.setCapacite(20000);
			a1.setConsomation(1);
			
			
			
	        
	         nodeA = new Node(mh5);
	         nodeB = new Node(mh6);
	         nodeC = new Node(mh7);
	         nodeD = new Node(mh8);
	         nodeE = new Node(mh9);
	         nodeF = new Node(mh11);
	         nodeG = new Node(mh10);


	        nodeA.addAdjacentNode(nodeB);
	        nodeB.addAdjacentNode(nodeA);
	        nodeA.addAdjacentNode(nodeC);
	        nodeC.addAdjacentNode(nodeA);
	        
	        nodeB.addAdjacentNode(nodeD);
	        nodeD.addAdjacentNode(nodeB);
	        nodeB.addAdjacentNode(nodeE);
	        nodeE.addAdjacentNode(nodeB);
	        
	        nodeC.addAdjacentNode(nodeG);
	        nodeG.addAdjacentNode(nodeC);
	        
	        nodeE.addAdjacentNode(nodeG);
	        nodeG.addAdjacentNode(nodeE);
	        
	        nodeD.addAdjacentNode(nodeF);
	        nodeF.addAdjacentNode(nodeD);
	        
	        nodeG.addAdjacentNode(nodeF);
	        nodeF.addAdjacentNode(nodeG);
	        
	        A.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),C,C.getData().getNember_places())));
	        B.setNeighbors(new HashMap<>(Map.of(A,A.getData().getNember_places(),D,D.getData().getNember_places(),E,E.getData().getNember_places())));
	        C.setNeighbors(new HashMap<>(Map.of(A,A.getData().getNember_places(),G,G.getData().getNember_places())));
	        D.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),F,F.getData().getNember_places())));
	        E.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),G,G.getData().getNember_places())));
	        G.setNeighbors(new HashMap<>(Map.of(E,E.getData().getNember_places(),C,C.getData().getNember_places(),F,F.getData().getNember_places())));
	        F.setNeighbors(new HashMap<>(Map.of(D,D.getData().getNember_places(),G,G.getData().getNember_places())));
	        
	        System.out.print("The Max Flow  from source "+E.getData().getNameairport()+"  to  "+A.getData().getNameairport()+" is : ");
	        System.out.println(new FordFulkerson<server_airport>().run(E,A));

			Dijkstra d3 = new Dijkstra(nodeE);
           ArrayList<server_airport> a3_ecalier =  d3.printPaths(List.of(nodeA)); 
			
			
			avion a3 = new avion(2,"boibng "+1+"",1+100,100); 
			a3.setCapacite(20000);
			a3.setConsomation(1);
			
			avion a5 = new avion(3,"boibng "+1+"",1+100,100); 
			a5.setCapacite(20000);
			a5.setConsomation(1);
		

	        
	         nodeA = new Node(mh5);
	         nodeB = new Node(mh6);
	         nodeC = new Node(mh7);
	         nodeD = new Node(mh8);
	         nodeE = new Node(mh9);
	         nodeF = new Node(mh11);
	         nodeG = new Node(mh10);


	        nodeA.addAdjacentNode(nodeB);
	        nodeB.addAdjacentNode(nodeA);
	        nodeA.addAdjacentNode(nodeC);
	        nodeC.addAdjacentNode(nodeA);
	        
	        nodeB.addAdjacentNode(nodeD);
	        nodeD.addAdjacentNode(nodeB);
	        nodeB.addAdjacentNode(nodeE);
	        nodeE.addAdjacentNode(nodeB);
	        
	        nodeC.addAdjacentNode(nodeG);
	        nodeG.addAdjacentNode(nodeC);
	        
	        nodeE.addAdjacentNode(nodeG);
	        nodeG.addAdjacentNode(nodeE);
	        
	        nodeD.addAdjacentNode(nodeF);
	        nodeF.addAdjacentNode(nodeD);
	        
	        nodeG.addAdjacentNode(nodeF);
	        nodeF.addAdjacentNode(nodeG);
	        
	        A.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),C,C.getData().getNember_places())));
	        B.setNeighbors(new HashMap<>(Map.of(A,A.getData().getNember_places(),D,D.getData().getNember_places(),E,E.getData().getNember_places())));
	        C.setNeighbors(new HashMap<>(Map.of(A,A.getData().getNember_places(),G,G.getData().getNember_places())));
	        D.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),F,F.getData().getNember_places())));
	        E.setNeighbors(new HashMap<>(Map.of(B,B.getData().getNember_places(),G,G.getData().getNember_places())));
	        G.setNeighbors(new HashMap<>(Map.of(E,E.getData().getNember_places(),C,C.getData().getNember_places(),F,F.getData().getNember_places())));
	        F.setNeighbors(new HashMap<>(Map.of(D,D.getData().getNember_places(),G,G.getData().getNember_places())));
	        
	        System.out.print("The Max Flow  from source "+F.getData().getNameairport()+"  to  "+A.getData().getNameairport()+" is : ");
	        System.out.println(new FordFulkerson<server_airport>().run(F,A));

			Dijkstra d2 = new Dijkstra(nodeF);
            ArrayList<server_airport> a2_ecalier =  d2.printPaths(List.of(nodeA)); 
			avion a2 = new avion(4,"boibng "+1+"",1+100,100); 
			a2.setCapacite(20000);
			a2.setConsomation(1);
			
			
			
			
			
			//create flights
			@SuppressWarnings("deprecation")
			flight usa_north_russia = new flight(a1,1,"usa to north russia", a1_ecalier);
			usa_north_russia .setNodes(d1.get_nodes(List.of(nodeB)));
			a1.setVol(usa_north_russia);
			new Thread(usa_north_russia).start();
			
			@SuppressWarnings("deprecation")
			flight usa_north_russia1 = new flight(a3,1,"usa to north russia", a3_ecalier);
			usa_north_russia1 .setNodes(d3.get_nodes(List.of(nodeE)));
			a3.setVol(usa_north_russia1);
			new Thread(usa_north_russia1).start();
			
			@SuppressWarnings("deprecation")
			flight usa_north_russia2 = new flight(a5,1,"usa to north russia", a3_ecalier);
			usa_north_russia2 .setNodes(d3.get_nodes(List.of(nodeE)));
			a5.setVol(usa_north_russia2);
			new Thread(usa_north_russia2).start();
			
			@SuppressWarnings("deprecation")
			flight tunissia_china = new flight(a2,2,"tunissia to china ",a2_ecalier);
			tunissia_china.setNodes(d2.get_nodes(List.of(nodeF)));
			a2.setVol(tunissia_china);
			new Thread(tunissia_china).start();

			

			//create companys
			
			//company skyscanner = new company(1,"skyScanner",new ArrayList<flight>(List.of(usa_north_russia,tunissia_china)));
 
			
			
			 

			




			new Thread(new alive_conversation_server(mh5)).start();
				 
			new Thread(new alive_conversation_server(mh6)).start();

			new Thread(new alive_conversation_server(mh7)).start();
			
			new Thread(new alive_conversation_server(mh8)).start();
			
			new Thread(new alive_conversation_server(mh9)).start();
			
			new Thread(new alive_conversation_server(mh10)).start();
			
			new Thread(new alive_conversation_server(mh11)).start();


	}

}
