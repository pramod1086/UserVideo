import React from 'react';
import './styles/innerContainer.css';

//TODO: create a seperate component. remove duplicate code blocks.


		class VideoGroups extends React.Component {
		constructor(props){
			super(props);
		}

		render() {
		    return (
					<div>
            <div className="wrapper">
							<div className="title"><strong>{this.props.videos}</strong></div>
							<div className="checkbox-btn">
								<input type="checkbox" name="" />
								<div><span className="slide"></span></div>
							</div>
						</div>
</div>



		    );
		  }
		}



export default VideoGroups;
