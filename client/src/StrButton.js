import React from "react";
import {add} from './actions';
import { Component } from "react";

class StrAddButton extends Component {
    render() {
        return (
            <input value="Add200" type="button" onClick={this.addString} />
        )
    }

    addString = () =>{
        this.props.store.dispatch(add());
    }
}

export default StrAddButton;