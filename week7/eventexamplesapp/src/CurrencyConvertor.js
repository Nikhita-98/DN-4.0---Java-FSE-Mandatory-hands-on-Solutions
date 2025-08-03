import React, { useState } from "react";

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  function handleSubmit(e) {
    e.preventDefault(); // Prevent form reload
    // Example static conversion rate: 1 Euro = 80 INR
    if (currency.trim().toLowerCase() === "euro") {
      alert(`Converting to Euro Amount is ${parseFloat(amount) * 80}`);
    } else {
      alert("Enter 'Euro' as currency to convert INR to Euro.");
    }
  }

  return (
    <div>
      <h1 style={{color: "green"}}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="text"
            value={amount}
            onChange={e => setAmount(e.target.value)}
          />
        </label>
        <br/>
        <label>
          Currency:
          <input
            value={currency}
            onChange={e => setCurrency(e.target.value)}
          />
        </label>
        <br/>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
