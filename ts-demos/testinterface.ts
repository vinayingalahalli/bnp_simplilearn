export interface MyInterface{

    requirement1():void;
    requirement2():void;
    requirement3():void;
}

export class MyInterfaceImpl implements MyInterface{
    requirement1(): void {
       console.log('requirement1 from MyInterfaceImpl')
    }
    requirement2(): void {
        console.log('requirement2 from MyInterfaceImpl')
    }
    requirement3(): void {
        console.log('requirement3 from MyInterfaceImpl')
    }
    
}