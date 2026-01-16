import { useState } from 'react'
import './App.css'

function App() {
  return (
    <div className="app">
      <img 
        src="/bg.png" 
        alt="Background"
        style={{
          position: 'fixed',
          top: 0,
          left: 0,
          width: '100%',
          height: '100%',
          objectFit: 'cover',
          zIndex: -1,
          filter: 'blur(4px)'
        }}
      />
      
      <header 
        style={{
          position: 'fixed',
          top: 0,
          left: 0,
          width: '100%',
          display: 'flex',
          justifyContent: 'center',
          alignItems: 'center',
          padding: '30px 0',
          zIndex: 5
        }}
      >
        <img 
          src="/ajiet-logo.svg" 
          alt="AJIET Logo"
          style={{
            width: '650px',
            height: 'auto'
          }}
        />
      </header>
    </div>
  )
}

export default App
