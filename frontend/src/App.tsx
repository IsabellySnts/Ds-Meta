import Header from "./components/header/Index"
import NotificationButton from "./components/notification-button"
import SalesCard from "./components/SalesCard"

function App() {

  return (
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard/>
          </div>
        </section>
      </main>
    </>
  )
}

export default App
