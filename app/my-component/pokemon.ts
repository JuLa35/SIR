export class Pokemon {
  name: string = "";
  id: number = 0;
  type: string = "";

  constructor(id: number, name: string, type: string) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  getId(){
	  return this.id
  }

  getName(){
	  return this.name
  }

  getType(){
	  return this.type
  }
}
