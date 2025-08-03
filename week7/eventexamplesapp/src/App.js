import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(5);

  // 1a. Increment function (triggers both increment and sayHello)
  function increment() {
    setCount(prev => prev + 1);
    sayHello();
  }
  // 1b. Say Hello function
  function sayHello() {
    alert("Hello! Member1");
  }

  // Decrement function
  function decrement() {
    setCount(prev => prev - 1);
  }

  // 2. Say Welcome function with an argument
  function sayMessage(msg) {
    alert(msg);
  }

  // 3. Synthetic event handler for button click
  function handleClick(e) {
    alert("I was clicked");
    // e is the SyntheticEvent object
  }

  return (
    <div style={{ padding: 20 }}>
      <p>{count}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br/>
      <button onClick={() => sayMessage("welcome")}>Say welcome</button>
      <br/>
      <button onClick={handleClick}>Click on me</button>
      <br/><br/>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
