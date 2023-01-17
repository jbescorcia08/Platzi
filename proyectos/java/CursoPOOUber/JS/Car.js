class Car {
  constructor(licence, driver) {
    this.id;
    this.licence = licence;
    this.driver = driver;
    this.passenger;
  }

  printDataCar() {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  }
}
