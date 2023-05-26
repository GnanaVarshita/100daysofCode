import React,{useState} from 'react'


export default function TextForm(props) {
  const handleUpClick =()=>{
    
    let newText =text.toUpperCase();
    setText(newText);
  }
  const handleLoClick =()=>{
   
    let newText =text.toLowerCase();
    setText(newText);
  }
  const handleClearClick =()=>{
   
    let newText =(' ');
    setText(newText);
  }
  const handleOnChange=(event)=>{
    console.log("On CHange");
    setText(event.target.value);
  }
  const[text,setText]=useState('Enter text here :');
 
  return (
    <>
    
    <div className="container">
       <h1>{props.heading}</h1>
        <div className="mb-3">
             <label for="myBox" class="form-label">Example textarea</label>
           <textarea className="form-control" value={text}  onChange= {handleOnChange} id="myBox" rows="8"></textarea>
        </div>
        <button className="btn.btn-primary mx-2" onClick={handleUpClick}>
            Convert to UpperCase
        </button>
        <button className="btn.btn-primary mx-2" onClick={handleLoClick}>
            Convert to LowerCase
        </button>
        <button className="btn.btn-primary mx-2" onClick={handleClearClick}>
            Clear Text
        </button>


    </div>
    <div className="conatiner my-2">
      <h1>Your text summary</h1>
      <p> {text.split(" ").length} words and {text.length} characters</p>
      <h2>Preview</h2>
      <p>{text}</p>
    </div>
    </>
  )
}
