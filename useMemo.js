export default function MyApp() {
    const [name, setName] = useState('');
    const [address, setAddress] = useState('');
      console.log("Main function",new Date().toLocaleTimeString())
    return (
      <>
        <label>
          Name{': '}
          <input value={name} onChange={e => setName(e.target.value)} />
        </label>
        <label>
          Address{': '}
          <input value={address} onChange={e => setAddress(e.target.value)} />
        </label>
        <Greeting name={name} />
        <Address address={address} />
      </>
    );
  }
  
  const Greeting =memo(function Greeting({ name }) {
    console.log("Greeting was rendered at", new Date().toLocaleTimeString());
    return <h3>Hello{name && ', '}{name}!</h3>;
  });
  const Address =memo(function Address({address}) {
    console.log("Address was rendered at", new Date().toLocaleTimeString());
    return <h3>Hello{address && ', '}{address}!</h3>;
  });
  