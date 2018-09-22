import React from 'react';
import './styles/container.css';
import InnerContainer from './innerContainer.jsx';
import SubmitButton from './submitButton.jsx';

class Container extends React.Component {
constructor(props){
	super(props);
}

render() {
    return (
			<div>
				<div className="container">
					<InnerContainer user={"User"} videos={"Videos"} users={this.props.users}/>
				</div>
				<SubmitButton />
			</div>
    )
  }
}

export default Container;
