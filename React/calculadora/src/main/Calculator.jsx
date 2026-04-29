import React, { Component } from "react";
import './Calculator.css';

import Button from '../components/Button';
import Display from "../components/Display";

const initialState = {
  displayValue: '0',
  clearDisplay: false,
  operation: null,
  values: [0, 0],
  current: 0
}

export default class Calculator extends Component{

  state = {...initialState}

  /* 
    Manipulação de click para identificar o que foi clicado foi utilizando o "click", ele é atribuido a uma função arrow
    Criei um construtor para fazer uso do bind, onde só preciso definir o this nele e não me preocupar com alguma confusão que o JS pode fazer em perder a variável e seu valor passada
      Utilizei este método apenas para o dígito pois seria utilizado mais vezes que a operação.
    Depois utilzei a criação de uma nova função, a setOperation, ela é definido dentro do render, para garantir que não perca a referência na memória pelo JS, evitado tbm pelo uso do bind
      Ela eu faço referencia apenas, sem o apontamento do this
    E por fim apliquei a função arrow dentro do componente de lebal AC, assim chamando nela mesma, afinal só precisara dela apenas uma vez.
   */

  constructor(props){
    super()
    this.addDigit = this.addDigit.bind(this);
  }

  clearMemory(){
    /* console.log('Limpar!'); */
    this.setState({...initialState})
    
  }

  setOperation(operation){
    console.log(operation);
    
  }

  addDigit(data){
    /* console.log(data); */
    if (data === '.' && this.state.displayValue.includes('.')) {
      return
    }
    
    const newClearDisplay = this.state.displayValue === '0'
      || this.state.clearDisplay
    const currentValue = newClearDisplay ? '' : this.state.displayValue
    const displayValue = currentValue + data
    this.setState({displayValue, clearDisplay: false})

    if (data !== '.') {
      const i = this.state.current
      const newValue = parseFloat(displayValue)
      const values = [...this.state.values]
      values[i] = newValue
      this.setState({ values})
      console.log(values);
      
    }
  }

  render(){

    const setOperation = oper => this.setOperation(oper)
    return(
      <div className="calculator">
          <Display value={this.state.displayValue}/>
          <Button label="AC" click={()=> this.clearMemory()} triple/>
          <Button label="/" click={setOperation} operation/>
          <Button label="7" click={this.addDigit}/>
          <Button label="8" click={this.addDigit}/>
          <Button label="9" click={this.addDigit}/>
          <Button label="*" click={setOperation} operation/>
          <Button label="4" click={this.addDigit}/>
          <Button label="5" click={this.addDigit}/>
          <Button label="6" click={this.addDigit}/>
          <Button label="-" click={setOperation} operation/>
          <Button label="1" click={this.addDigit}/>
          <Button label="2" click={this.addDigit}/>
          <Button label="3" click={this.addDigit}/>
          <Button label="+" click={setOperation} operation/>
          <Button label="0" click={this.addDigit} double/>
          <Button label="." click={this.addDigit}/>
          <Button label="=" click={setOperation} operation/>
      </div>
    )
  }
}