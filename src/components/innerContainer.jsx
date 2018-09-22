import React from 'react';
import './styles/innerContainer.css';
import UserComponent from './UserComponent';


//TODO: create a seperate component. remove duplicate code blocks.


		class InnerContainer extends React.Component {
		constructor(props){
			super(props);
		}

		render() {
		    return (
					<div>
						<div className="wrapper">
							<div className="title"><strong>{this.props.user}</strong></div>
							<div className="checkbox-btn">
								<input type="checkbox" name="" />
								<div><span className="slide"></span></div>
							</div>
							<UserComponent users={this.props.users}/>
						</div>


						<div className="wrapper">
							<div className="title"><strong>{this.props.videos}</strong></div>
							<div className="checkbox-btn">
								<input type="checkbox" name="video" />
								<div><span className="slide"></span></div>
							</div>
						</div>
					</div>

		    );
		  }
		}



export default InnerContainer;
