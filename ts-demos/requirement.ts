export abstract class Requirement{

        display():void{
            console.log("Hello abstract")
    }
    abstract requirement1();
}

export class Implementor extends Requirement{
    requirement1() {
        console.log("requirement1");
    }
    
}