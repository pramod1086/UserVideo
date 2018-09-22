// import React from 'react';
// import './styles/innerContainer.css';
//
// //TODO: create a seperate component. remove duplicate code blocks.
//
//
// 	export	class UserComponent extends React.Component {
// 		constructor(props){
// 			super(props);
// 		}
//
// 		render() {
//       return (
//         <div>
//           <tr>
//     				<td>{this.props.users.firstName}</td>
//     				<td>{this.props.users.lastName}</td>
//     			</tr>
//         </div>
//
// 		);
//  //      render() {
//  //   var employees = this.props.users.map(employee =>
//  //     <Employee key={employee._links.self.href} employee={employee}/>
//  //   );
//  //   return (
//  //     return (
// 	// 		<tr>
// 	// 			<td>{this.props.employee.firstName}</td>
// 	// 			<td>{this.props.employee.lastName}</td>
// 	// 			<td>{this.props.employee.description}</td>
// 	// 		</tr>
// 	// 	)
//  //   )
//  // }
// 		}


import React from 'react';
import './styles/innerContainer.css';

//TODO: create a seperate component. remove duplicate code blocks.


		class UserComponent extends React.Component {
		constructor(props){
			super(props);
		}

		render() {
		    return (
					<div>
            <tr>
            				<td>{this.props.users.firstName}</td>
            				<td>{this.props.users.lastName}</td>
            			</tr>

</div>



		    );
		  }
		}



export default UserComponent;
