import React from "react";
import { Component } from "react";
import StrAddButton from './StrAddButton';

class App extends Component {
  render() {
    return (
      <div>
        <h1>Start React</h1>
        <span>{this.props.store.getState().data.str}</span><br/>
        <StrAddButton store={this.props.store}/>

      </div>
    )
  }
}

export default App;
