import React from "react";

// Data
const courses = [
  { id: 1, name: "Angular", date: "4/5/2021" },
  { id: 2, name: "React", date: "6/3/2021" },
];

const books = [
  { id: 1, bname: "Master React", price: 670 },
  { id: 2, bname: "Deep Dive into Angular 11", price: 800 },
  { id: 3, bname: "Mongo Essentials", price: 450 },
];

const blogs = [
  {
    id: 1,
    title: "React Learning",
    author: "Stephen Biz",
    content: "Welcome to learning React!",
  },
  {
    id: 2,
    title: "Installation",
    author: "Schewzdenier",
    content: "You can install React from npm.",
  },
];

// Course Details Component
function CourseDetails({ courses }) {
  return (
    <div>
      <h2 style={{ fontWeight: "bold" }}>Course Details</h2>
      {courses.map((course) => (
        <div key={course.id} style={{ marginBottom: 12 }}>
          <div style={{ fontWeight: "bold", fontSize: 22 }}>{course.name}</div>
          <div style={{ fontSize: 18 }}>{course.date}</div>
        </div>
      ))}
    </div>
  );
}

// Book Details Component
function BookDetails({ books }) {
  return (
    <div>
      <h2 style={{ fontWeight: "bold" }}>Book Details</h2>
      {books.map((book) => (
        <div key={book.id} style={{ marginBottom: 12 }}>
          <div style={{ fontWeight: "bold", fontSize: 19 }}>{book.bname}</div>
          <div style={{ fontSize: 16 }}>{book.price}</div>
        </div>
      ))}
    </div>
  );
}

// Blog Details Component
function BlogDetails({ blogs }) {
  return (
    <div>
      <h2 style={{ fontWeight: "bold" }}>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id} style={{ marginBottom: "18px" }}>
          <div style={{ fontWeight: "bold", fontSize: 22 }}>{blog.title}</div>
          <div style={{ fontWeight: "bold" }}>{blog.author}</div>
          <div>{blog.content}</div>
        </div>
      ))}
    </div>
  );
}

function App() {
  // Three columns, vertical green borders between columns
  const containerStyle = {
    display: "flex",
    justifyContent: "space-evenly",
    alignItems: "flex-start",
    height: "90vh",
    marginTop: 18,
  };
  const colStyle = {
    flex: 1,
    padding: 15,
    minWidth: 250,
    fontFamily: "sans-serif",
    fontSize: 17,
    boxSizing: "border-box",
  };
  const borderStyle = {
    borderLeft: "4px solid #228B22",
    borderRight: "4px solid #228B22",
    margin: "0 25px",
    minHeight: "85%",
    height: "100%",
  };

  return (
    <div>
      <h1 style={{ textAlign: "center", marginTop: "20px" }}>React App</h1>
      <div style={containerStyle}>
        <div style={colStyle}>
          <CourseDetails courses={courses} />
        </div>

        <div style={{ ...colStyle, ...borderStyle }}>
          <BookDetails books={books} />
        </div>

        <div style={colStyle}>
          <BlogDetails blogs={blogs} />
        </div>
      </div>
    </div>
  );
}

export default App;
