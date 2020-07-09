import { Implementor, Requirement } from "./requirement";
import { MyInterface, MyInterfaceImpl } from "./testinterface";

let i:Requirement=new Implementor();
i.display();
i.requirement1();

let i2:MyInterface =new MyInterfaceImpl();
i2.requirement1();
i2.requirement2();
i2.requirement3();