import React from 'react';
import './App.css';
import img from './office.jpeg';

function App() {
  const officeList = [
    { name: "DBS", rent: 50000, address: "Chennai" },
    { name: "WeWork", rent: 70000, address: "Bangalore" },
    { name: "Regus", rent: 55000, address: "Hyderabad" }
  ];

  const getColorClass = (rent) => (rent <= 60000 ? 'textRed' : 'textGreen');

  return (
    <div style={{ padding: '20px' }}>
      <h1>Office Space, at Affordable Range</h1>
      <img src={img} alt="Office Space" width="25%" height="25%" />
      <br /><br />

      {officeList.map(({ name, rent, address }) => (
        <div key={name}>
          <h1>Name: {name}</h1>
          <h3 className={getColorClass(rent)}>Rent: Rs. {rent}</h3>
          <h3>Address: {address}</h3>
          <br />
        </div>
      ))}
    </div>
  );
}

export default App;
