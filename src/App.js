
import './App.css';

import Navbar from './components/Navbar';
import TextForm from './components/TextForm';

function App() {
  return (
    <div className="App">
      
 
        <Navbar title="TextUtils" />
        <div className="container">
        <TextForm heading="Enter the text to analyze"/>
        </div>
        

    </div>
    
      
      
      
    
  );
}

export default App;
