

export class Player {
    private id: number;
    private name: string;
    constructor(id: number, name: string) {
        this.id = id;
        this.name = name;
    }
    printPlayer() {
        console.log("Id = " + this.id + " name = " + this.name)
    }
}

