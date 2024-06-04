import json

def save_data(data, filename):
    with open(filename, 'w') as file:
        json.dump(data, file)
    print(f"Data has been saved to {filename}")

def load_data(filename):
    try:
        with open(filename, 'r') as file:
            data = json.load(file)
        return data
    except json.JSONDecodeError:
        print(f"Failed to load data: The file {filename} is not in a valid JSON format.")
    except Exception as e:
        print(f"Failed to load data: {e}")

# The main function remains the same
def main():
    while True:
        print("1. Save data")
        print("2. Load data")
        print("3. Exit")
        choice = input("Enter your choice: ")
        
        if choice == '1':
            data = input("Enter the data to be saved: ")
            filename = input("Enter the filename: ")
            save_data(data, filename)
        elif choice == '2':
            filename = input("Enter the filename: ")
            try:
                data = load_data(filename)
                print(f"Data loaded: {data}")
            except Exception as e:
                print(f"Failed to load data: {e}")
        elif choice == '3':
            break
        else:
            print("Invalid choice, please try again.")

if __name__ == "__main__":
    main()