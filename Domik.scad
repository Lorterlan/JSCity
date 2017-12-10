 //левая стенка(1)
 difference() {
 translate([50,2,25]) {
 cube([70,40,50],true);
 }
for(j = [30:20:80]){
translate([j,20,35]) { cube([8,5,10],true);}}
for(j = [30:20:80]){
translate([j,20,15]) { cube([8,5,10],true);}}
}
//левая стенка(2)
 difference() {
  translate([7,2,25]) {
 cube([17,40,50],true);
 }
 translate([7,2,0]) {
 cube([17,40,40],true);
 }
 {rotate([90,0,0]) 
 translate([7,22,-22])
 cylinder(h=50, r1=8, r2=8);}
 }
 //правая
 difference() {
 translate([-21,-103,35]){ 
 cube([40,170,70],true);
 }
 for(j = [-25:-20:-180]){
translate([-40,j,60]) { cube([5,8,10],true);}}
for(j = [-25:-20:-180]){
translate([-40,j,40]) { cube([5,8,10],true);}}
for(j = [-35:-40:-180]){
translate([-40,j,13]) { cube([5,25,25],true);}}
 }
 //навесы
 for(j = [-35:-40:-180]){
 translate([-40,j,15]) 
 rotate([0,60,0])
 cube([1,25,15],true);
 }
 hull() {
 translate([84,22,43])
rotate([90,30,90])
cylinder(1,7,7,$fn=3);
translate([0,22,43])
rotate([90,30,90])
cylinder(1,7,7,$fn=3);
}
translate([-40,0,15]) 
 rotate([0,60,0])
 cube([1,9,15],true);
translate([-21,20,15]) 
 rotate([60,0,0])
 cube([9,1,15],true);

 //центр
 difference() {
 translate([-21,2,67]) {
 cube([40,40,135],true);
 } 
  translate([-40,20,65]) {
 cube([10,10,132],true);
 }
 //окна и двери(1)
 translate([-21,20,5]) { cube([9,5,15],true);}
 translate([-21,20,30]) { cube([5,5,5],true);}
 translate([-21,20,50]) { cube([5,5,5],true);}
 translate([-21,20,70]) { cube([5,5,5],true);}
 translate([-21,20,90]) { cube([5,5,5],true);}
 //окна и двери(2)
 translate([-40,0,30]) { cube([5,5,5],true);}
 translate([-40,0,50]) { cube([5,5,5],true);}
 translate([-40,0,70]) { cube([5,5,5],true);}
 translate([-40,0,90]) { cube([5,5,5],true);}
 translate([-40,0,5]) { cube([5,9,15],true);
 }
//часы
{rotate([90,0,0]) 
translate([-21,110,-25])
cylinder(h=4, r1=6, r2=6);
}
{rotate([90,0,90]) 
translate([0,110,-45])
cylinder(h=4, r1=6, r2=6);
 }
}
//правая вершина
translate([-21,-168,45]) {
 cube([30,40,70],true);
}
// центр. вершина
polyhedron(

        points=[ [-37,17,135],[-37,-13,135],[-7,-13,135],[-7,17,135], // четыре точки , основания пирамиды
    [-22,0,175]  ], // точка вершины
    faces=[ [0,1,4],[1,2,4],[2,3,4],[3,0,4],       // формирование боковых плоскостей 
    [1,0,3],[2,1,3] ]  // формирование плоскости основания
);