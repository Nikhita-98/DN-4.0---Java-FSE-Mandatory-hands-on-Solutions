import React, { useState } from 'react';

// Login Button Component
function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

// Logout Button Component
function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

// Guest Page Component (for users not logged in)
function GuestPage() {
  return (
    <div>
      <h2>Flight Details</h2>
      <ul>
        <li>Flight: AI101 | From: Delhi | To: London | Time: 10:00 AM</li>
        <li>Flight: AI102 | From: London | To: Delhi | Time: 6:00 PM</li>
      </ul>
      <p><b>Please log in to book tickets.</b></p>
    </div>
  );
}

// User Page Component (for logged in users)
function UserPage() {
  return (
    <div>
      <h2>Flight Details (Book Your Ticket!)</h2>
      <ul>
        <li>
          Flight: AI101 | From: Delhi | To: London | Time: 10:00 AM{' '}
          <button>Book</button>
        </li>
        <li>
          Flight: AI102 | From: London | To: Delhi | Time: 6:00 PM{' '}
          <button>Book</button>
        </li>
      </ul>
      <p>Welcome, you can now book tickets!</p>
    </div>
  );
}

// Main App Component
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Element variable to hold the page JSX component to render
  let page;
  if (isLoggedIn) {
    page = <UserPage />;
  } else {
    page = <GuestPage />;
  }

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h1>Ticket Booking App</h1>

      {/* Render Login or Logout button conditionally */}
      {isLoggedIn ? (
        <LogoutButton onClick={() => setIsLoggedIn(false)} />
      ) : (
        <LoginButton onClick={() => setIsLoggedIn(true)} />
      )}

      <hr style={{ margin: '30px' }} />

      {/* Render the conditional page */}
      {page}
    </div>
  );
}

export default App;
