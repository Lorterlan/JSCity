package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.coords.Triangle3d;
import eu.printingin3d.javascad.enums.Side;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

public class Bosfor extends Union {
	private static final double WIDTH = 40.0;
	private static final double HEIGHT = 50;
	private static final double AXLE_INNER_DIAMETER = 4.75;
	private static final double AXLE_OUTER_DIAMETER = 6.51;
	private static final double AXLE_ONE_DIAMETER = 3.0;
	private static final double KNOB_RADIUS = 8;
	private static final double KNOT_RADIUS = 0;

	public Bosfor(int xSize, int ySize) {
		super(getModels(xSize, ySize));
	}



	private static List<Abstract3dModel> getModels(int xSize, int ySize) {
		List<Abstract3dModel> models = new ArrayList<>();
		//Левая стенка(1)
		Difference leftWallOne = new Difference(
				new Cube(new Dims3d(WIDTH*1.75, WIDTH, HEIGHT*1.25)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(25)),
		        new Cube(new Dims3d(WIDTH*0.2, WIDTH*0.125, HEIGHT*0.25)).move(Coords3d.xOnly(30)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(35)),
				new Cube(new Dims3d(WIDTH*0.2, WIDTH*0.125, HEIGHT*0.25)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(35)),
		        new Cube(new Dims3d(WIDTH*0.2, WIDTH*0.125, HEIGHT*0.25)).move(Coords3d.xOnly(70)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(35)),
		        new Cube(new Dims3d(WIDTH*0.2, WIDTH*0.125, HEIGHT*0.25)).move(Coords3d.xOnly(30)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(15)),
				new Cube(new Dims3d(WIDTH*0.2, WIDTH*0.125, HEIGHT*0.25)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(15)),
				new Cube(new Dims3d(WIDTH*0.2, WIDTH*0.125, HEIGHT*0.25)).move(Coords3d.xOnly(70)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(15))
				);
		//Левая стенка(2)
		Difference leftWallTwo = new Difference(
				new Cube(new Dims3d(WIDTH*0.425, WIDTH, HEIGHT*1.25)).move(Coords3d.xOnly(7)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(25)),
				new Cube(new Dims3d(WIDTH/0.425, WIDTH, HEIGHT)).move(Coords3d.xOnly(7)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(0)),
				new Cylinder(HEIGHT*1.6,KNOB_RADIUS).rotate(Angles3d.xOnly(90)).move(Coords3d.xOnly(7)).move(Coords3d.yOnly(22)).move(Coords3d.zOnly(25))
		);
		//Центральная стенка
		Difference CenterWall = new Difference(
				new Cube(new Dims3d(WIDTH, WIDTH, HEIGHT+85)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(61)),
				new Cube(new Dims3d(WIDTH-30, WIDTH-30, HEIGHT+82)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(59)),
		//Окна и двери(1)
		        new Cube(new Dims3d(WIDTH-31, WIDTH-35, HEIGHT-35)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(20)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(25)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(45)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(65)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(85)),
		  //Окна  и двери(2)
				new Cube(new Dims3d(WIDTH-35, WIDTH-31, HEIGHT-35)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(0)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(25)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(45)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(65)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-35, HEIGHT-45)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(85)),
		//Часы
				new Cylinder(HEIGHT-46,KNOB_RADIUS-2).rotate(Angles3d.xOnly(90)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(22)).move(Coords3d.zOnly(105)),
		        new Cylinder(HEIGHT-46,KNOB_RADIUS-2).rotate(Angles3d.xOnly(90)).rotate(Angles3d.zOnly(90)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(105))

		);
		//Правая вершина
		Difference RightTop = new Difference(
		new Cube(new Dims3d(WIDTH-10, WIDTH, HEIGHT+20)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(-168)).move(Coords3d.zOnly(35))
		);
		// центр. вершина
        Difference CentralTop = new Difference(
				new Cylinder(HEIGHT+5,KNOB_RADIUS+10,KNOT_RADIUS).move(Coords3d.xOnly(-20)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(150))
		);
		Difference CentralTopS = new Difference(
				new Cylinder(HEIGHT-10,KNOB_RADIUS-6,KNOT_RADIUS+1).move(Coords3d.xOnly(-20)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(170))
		);
		//Правая стенка
		Difference RightWall = new Difference(
				new Cube(new Dims3d(WIDTH, WIDTH+130, HEIGHT+20)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(-103)).move(Coords3d.zOnly(28)),
				//3 этаж
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-30)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-50)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-70)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-90)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-110)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-130)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-150)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-170)).move(Coords3d.zOnly(50)),
				//2 этаж
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-30)).move(Coords3d.zOnly(30)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-50)).move(Coords3d.zOnly(30)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-70)).move(Coords3d.zOnly(30)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-90)).move(Coords3d.zOnly(30)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-110)).move(Coords3d.zOnly(30)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-130)).move(Coords3d.zOnly(30)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-150)).move(Coords3d.zOnly(30)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-32, HEIGHT-40)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-170)).move(Coords3d.zOnly(30)),
				//вход
				new Cube(new Dims3d(WIDTH-35, WIDTH-15, HEIGHT-25)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-40)).move(Coords3d.zOnly(5)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-15, HEIGHT-25)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-80)).move(Coords3d.zOnly(5)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-15, HEIGHT-25)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-120)).move(Coords3d.zOnly(5)),
				new Cube(new Dims3d(WIDTH-35, WIDTH-15, HEIGHT-25)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-160)).move(Coords3d.zOnly(5))
		);
		//Навесы
		Difference RightAwning1 = new Difference(
				new Cube(new Dims3d(WIDTH-39, WIDTH-15, HEIGHT-35)).rotate(Angles3d.yOnly(60)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-40)).move(Coords3d.zOnly(7))
		);
		Difference RightAwning2 = new Difference(
				new Cube(new Dims3d(WIDTH-39, WIDTH-15, HEIGHT-35)).rotate(Angles3d.yOnly(60)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-80)).move(Coords3d.zOnly(7))
		);
		Difference RightAwning3 = new Difference(
				new Cube(new Dims3d(WIDTH-39, WIDTH-15, HEIGHT-35)).rotate(Angles3d.yOnly(60)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-120)).move(Coords3d.zOnly(7))
		);
		Difference RightAwning4 = new Difference(
				new Cube(new Dims3d(WIDTH-39, WIDTH-15, HEIGHT-35)).rotate(Angles3d.yOnly(60)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-160)).move(Coords3d.zOnly(7))
		);
		Difference LefttAwning = new Difference(
				new Cylinder(HEIGHT+37,KNOB_RADIUS).rotate(Angles3d.xOnly(90)).rotate(Angles3d.yOnly(30)).rotate(Angles3d.zOnly(90)).move(Coords3d.xOnly(42)).move(Coords3d.yOnly(22)).move(Coords3d.zOnly(49)),
				new Cube(new Dims3d(WIDTH+47, WIDTH-20, HEIGHT-25)).move(Coords3d.xOnly(42)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(35))
		);
		Difference CenterAwning1 = new Difference(
				new Cube(new Dims3d(WIDTH-39, WIDTH-31, HEIGHT-35)).rotate(Angles3d.yOnly(60)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(8))
		);
		Difference CenterAwning2 = new Difference(
				new Cube(new Dims3d(WIDTH-31, WIDTH-39, HEIGHT-35)).rotate(Angles3d.xOnly(60)).move(Coords3d.xOnly(-21)).move(Coords3d.yOnly(20)).move(Coords3d.zOnly(8))
		);

		models.add(CentralTop);
		models.add(CentralTopS);
		models.add(RightTop);
		models.add(RightWall);
		models.add(leftWallTwo);
		models.add(leftWallOne);
		models.add(CenterWall);
		models.add(RightAwning1);
		models.add(RightAwning2);
		models.add(RightAwning3);
		models.add(RightAwning4);
		models.add(LefttAwning);
		models.add(CenterAwning1);
		models.add(CenterAwning2);
		return models;
	}
}